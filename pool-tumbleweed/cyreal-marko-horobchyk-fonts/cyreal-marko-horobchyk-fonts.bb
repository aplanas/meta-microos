SUMMARY = "Marko Horobchyk Font"
DESCRIPTION = "Marko Horobchyk is a brush-inspired typeface for children's literature. \
 \
As the name suggests (Horobchyk is Ukrainian for sparrow), the initial \
idea was to create a typeface-companion for Marko the sparrow — a \
cartoon character by illustrator and type designer Zhenya Spizhovyi. \
 \
Marko Horobchyk is simple and smooth, has special inner tension and \
eye-catchy detailing. The letterforms are based on calligraphy and \
sketches — this is what makes Marko Horobchyk lively, enchanting, and \
amiable. \
 \
Marko Horobchyk will work best in medium to large sizes and captivating \
headlines. \
While it is technically optimised for better performance on screen, \
carefully adjusted outlines promise good quality in print too."
LICENSE = "OFL-1.1"

PV = "1.003"

RPM_NAME = "cyreal-marko-horobchyk-fonts-1.003-7.17.noarch.rpm"
RPM_HASH = "90f7c9b9be87609ca1004eabf36b8c3577bc36134feaf922eeba357f038240f7939e55b1b6f5d710b53b55ed03fe5665ae14255cd5dab03786d72a545edf930c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-marko-horobchyk-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
