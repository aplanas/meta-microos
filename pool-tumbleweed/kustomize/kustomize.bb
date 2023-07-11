SUMMARY = "Customization of kubernetes YAML configurations"
DESCRIPTION = "kustomize customizes raw, template-free kubernetes YAML files for \
multiple purposes, leaving the original YAML untouched and usable \
as is."
LICENSE = "Apache-2.0"

PV = "4.5.7"

RPM_NAME = "kustomize-4.5.7-1.4.aarch64.rpm"
RPM_HASH = "01e5735867801a4ec26f807fa3647d3fadacc461e79bdb82d1db67980265c162e0e03e141541f93e48596c93260228259025c03e88a03019aab58f000ecf2783"

RPROVIDES:${PN} += "kustomize"

RDEPENDS:${PN} += ""

inherit rpm
