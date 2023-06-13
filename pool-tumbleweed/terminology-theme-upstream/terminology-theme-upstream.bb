SUMMARY = "Default Enlightenment theme"
DESCRIPTION = "For use with upstream branding, when using openSUSE themes, when using \
openSUSE themes. \
 \
Use the Dark theme instead."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-upstream-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "3ac26a6fabceaf2bc6c56c7b14782e39441886b9c8c16753655dc158551b3b277b66388ac8d8215b441bd32174724af64767d818c2041b1a39b86555639c9dc1"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-dft \
terminology-theme-upstream \
terminology-theme-upstream(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
