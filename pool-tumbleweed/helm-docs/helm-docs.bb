SUMMARY = "A tool for automatically generating markdown documentation for helm charts"
DESCRIPTION = "The helm-docs tool auto-generates documentation from helm charts into markdown files. The resulting files contain metadata about their respective chart and a table with each of the chart's values, their defaults, and an optional description parsed from comments. \
 \
The markdown generation is entirely gotemplate driven. The tool parses metadata from charts and generates a number of sub-templates that can be referenced in a template file (by default README.md.gotmpl). If no template file is provided, the tool has a default internal template that will generate a reasonably formatted README."
LICENSE = "GPL-3.0-only"

PV = "1.11.0"

RPM_NAME = "helm-docs-1.11.0-1.6.aarch64.rpm"
RPM_HASH = "78e6fddfb8b65355f481e9b47e19e32e5c08d749c85a0fde98db6bbf22447f97b20f1109a308f34c712cfa506201209939481b865a8c84343231613249d9601f"

RPROVIDES:${PN} += "helm-docs"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
