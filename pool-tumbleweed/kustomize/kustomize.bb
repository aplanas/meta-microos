SUMMARY = "Customization of kubernetes YAML configurations"
DESCRIPTION = "kustomize customizes raw, template-free kubernetes YAML files for \
multiple purposes, leaving the original YAML untouched and usable \
as is."
LICENSE = "Apache-2.0"

PV = "4.5.7"

RPM_NAME = "kustomize-4.5.7-1.3.aarch64.rpm"
RPM_HASH = "439871d8ae8e6e847e8c27bd0df5beea6fc8ec299b182c89a7b620d929543d3a393ed245ad544fe63f0633a70de90bab452f39f8c561ece60acafd2689aac3e1"

RPROVIDES:${PN} += "kustomize"

RDEPENDS:${PN} += ""

inherit rpm
