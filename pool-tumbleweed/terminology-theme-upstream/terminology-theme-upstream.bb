SUMMARY = "Default Enlightenment theme"
DESCRIPTION = "For use with upstream branding, when using openSUSE themes, when using \
openSUSE themes. \
 \
Use the Dark theme instead."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-upstream-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "2cff8f10ce9ec93457185e2a1611591efbb962f9c0696761daed1d64ccb682671a073bdfb17352bfea996ba3fd64f3452279441c817e5261a95e05ae05824c5f"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-dft \
terminology-theme-upstream"

RDEPENDS:${PN} += ""

inherit rpm
