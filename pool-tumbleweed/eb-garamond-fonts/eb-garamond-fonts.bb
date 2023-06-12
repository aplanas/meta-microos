SUMMARY = "Claude Garamont's designs go open source"
DESCRIPTION = "Garamont’s fonts represent a milestone in the history of type design, \
a touchstone to which font designers have been returning ever since. EB Garamond \
is an open source project to create a revival of Claude Garamont’s famous \
humanist typeface from the mid-16th century. Its design reproduces the original \
by Claude Garamont: The source for the letterforms is a scan of a specimen known \
as the “Berner specimen”, which, composed in 1592 by Conrad Berner, son-in-law \
of Christian Egenolff and his successor at the Egenolff print office, shows \
Garamont’s roman and Granjon’s italic fonts at different sizes. Hence the name \
of this project: Egenolff-Berner Garamond."
LICENSE = "OFL-1.1"

PV = "0.016"

RPM_NAME = "eb-garamond-fonts-0.016-1.16.noarch.rpm"
RPM_HASH = "b9b71f23e6466e8bed4f6cb92218d2c17630ec131c3158f084fe1fd28585f59df4aae63abc27512f7b270c7ab2ab17feccb0dfbdde35bd3d60b62c60ba1e1008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eb-garamond \
eb-garamond-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
