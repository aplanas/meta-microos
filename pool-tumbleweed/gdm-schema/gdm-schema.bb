SUMMARY = "Config schema for GDM"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-schema-44.1-2.1.noarch.rpm"
RPM_HASH = "f44f3acfe1887618ce78dd6cb2687d508f827a08bcd308d9eb976493ec6da0af01f9d7215d70a3e550d5618e7937375389f486b03a1525f244a20269bb3367dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-schema"

RDEPENDS:${PN} += ""

inherit rpm
