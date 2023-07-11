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

RPM_NAME = "perl-SVN-Simple-0.28-3.29.aarch64.rpm"
RPM_HASH = "81de66d3d2fa2224af31b4e083a4ada9d3574943e21c508f81004cf9a8597cc5ff4d674c6ae5c38de72f38b1bcbfdb7e837b70c3734aea95fb155f61593c46a0"

RPROVIDES:${PN} += "perl-SVN--Simple--Edit \
perl-SVN--Simple--Editor \
perl-SVN-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
subversion-perl"

inherit rpm
