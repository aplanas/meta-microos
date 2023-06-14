SUMMARY = "Image editing application"
DESCRIPTION = "Pinta is a free, open source drawing/editing application designed \
after Paint.NET. Its goal is to provide users with a simple yet \
powerful way to draw and manipulate images."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "pinta-1.7.1-1.5.noarch.rpm"
RPM_HASH = "3ee0485d3ad7aa145cb2ea3cc741f180bc28b0f90d0001427aca3a4658a1280e4af07d2976928fad7cf26cafa0fd889cf1ef19dfc2a162167f8a05163ffd9880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Pinta \
mono-Pinta.Core \
mono-Pinta.Docking \
mono-Pinta.Effects \
mono-Pinta.Gui.Widgets \
mono-Pinta.Resources \
mono-Pinta.Tools \
pinta"

RDEPENDS:${PN} += "/bin/sh \
mono-ICSharpCode.SharpZipLib \
mono-Mono.Addins \
mono-Mono.Addins.Gui \
mono-Mono.Addins.Setup \
mono-Mono.Cairo \
mono-Mono.Posix \
mono-System \
mono-System.Core \
mono-System.Xml \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib \
mono-pango-sharp"

inherit rpm
