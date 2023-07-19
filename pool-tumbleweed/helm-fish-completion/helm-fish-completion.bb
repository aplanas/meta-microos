SUMMARY = "Fish Completion for helm"
DESCRIPTION = "Fish command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.2"

RPM_NAME = "helm-fish-completion-3.12.2-1.1.noarch.rpm"
RPM_HASH = "ec880e2433dd726234beb38df7aeecc1fd665ff21d448ad6998f81e3b1f94026ee9f94ae00008bf0bcc7cedc67ada5af70f2811814fe8973b67df21ffc25f0d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-fish-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
