SUMMARY = "A tool for automatically generating markdown documentation for helm charts"
DESCRIPTION = "The helm-docs tool auto-generates documentation from helm charts into markdown files. The resulting files contain metadata about their respective chart and a table with each of the chart's values, their defaults, and an optional description parsed from comments. \
 \
The markdown generation is entirely gotemplate driven. The tool parses metadata from charts and generates a number of sub-templates that can be referenced in a template file (by default README.md.gotmpl). If no template file is provided, the tool has a default internal template that will generate a reasonably formatted README."
LICENSE = "GPL-3.0-only"

PV = "1.11.0"

RPM_NAME = "helm-docs-1.11.0-1.7.aarch64.rpm"
RPM_HASH = "45e6f6d3b0a26f11cbf32c431530b0483553e41efffbc579c41e11a44c86161c3bf02e767e7aae6ba2dc0062ab619a34382b34a51fa3f4ec2ec8e0358151af99"

RPROVIDES:${PN} += "helm-docs"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
