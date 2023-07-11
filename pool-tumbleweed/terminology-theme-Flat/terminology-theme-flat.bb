SUMMARY = "Default terminology theme(Flat)"
DESCRIPTION = "The default theme for terminology install when using openSUSE branding."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-Flat-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "f2e99caf20ca3fda4986e4f70653365c8bc7dd2adf95d3821a008c1cf3ff973941a771d007fc31b221980c39c8149bd78d8c12625a75be5228500e78e89839d7"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-Flat"

RDEPENDS:${PN} += ""

inherit rpm
