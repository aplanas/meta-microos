SUMMARY = "Amiri Naksh Typeface"
DESCRIPTION = "Amiri family is high quality Arabic Naskh typeface."
LICENSE = "OFL-1.1"

PV = "0.109"

RPM_NAME = "arabic-amiri-fonts-0.109-18.15.noarch.rpm"
RPM_HASH = "d6b91a6c89b689759cb74c67e97206c2083037066840df3332d12334f83f25998fc1f3ad11008d7c16300a684ffe284df892816e09279680657e715d0793d827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-amiri-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
