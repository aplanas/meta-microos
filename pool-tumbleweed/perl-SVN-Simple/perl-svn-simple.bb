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

RPM_NAME = "perl-SVN-Simple-0.28-3.30.aarch64.rpm"
RPM_HASH = "6c54a4863a7f936d420c242c309a3f1c0be3cf591d38c8f03e3f2fa1dbdb3fbef98345beb2c943a66bc651e532ab209febfd7d306e9633024a792fd13221dfa1"

RPROVIDES:${PN} += "perl-SVN--Simple--Edit \
perl-SVN--Simple--Editor \
perl-SVN-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
subversion-perl"

inherit rpm
