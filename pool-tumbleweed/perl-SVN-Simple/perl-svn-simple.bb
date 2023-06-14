SUMMARY = "A simple interface to subversion's editor interface"
DESCRIPTION = "SVN::Simple::Edit wraps the subversion delta editor with a perl \
friendly interface and then you could easily drive it for describing \
changes to a tree. A common usage is to wrap the commit editor, so you \
could make commits to a subversion repository easily. \
 \
 \
 \
Authors: \
-------- \
    Chia-liang Kao <clkao at clkao dot org>"
LICENSE = "Artistic-1.0"

PV = "0.28"

RPM_NAME = "perl-SVN-Simple-0.28-3.28.aarch64.rpm"
RPM_HASH = "a45ea6940ccd5600f72d94168be7852624885980578b72a67518da79a60b7570b2dfc1c67afffbef6382f38f5e231fa655e7728b5d53ac4b8906224b4181012c"

RPROVIDES:${PN} += "perl-SVN--Simple--Edit \
perl-SVN--Simple--Editor \
perl-SVN-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
subversion-perl"

inherit rpm
