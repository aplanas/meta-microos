SUMMARY = "Template::GD Perl module"
DESCRIPTION = "Template::GD Perl module"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.66"

RPM_NAME = "perl-Template-GD-2.66-1.23.noarch.rpm"
RPM_HASH = "2a5db5fc3e0f570ecb2d3064c95b37c3e26f4e9c51f715f962687649c5a3b71b070e1b497321b69701f375e51f8589e004cd22244308d7cb1d1bda4e1647cad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--GD \
perl-Template--Plugin--GD--Constants \
perl-Template--Plugin--GD--Graph--area \
perl-Template--Plugin--GD--Graph--bars \
perl-Template--Plugin--GD--Graph--bars3d \
perl-Template--Plugin--GD--Graph--lines \
perl-Template--Plugin--GD--Graph--lines3d \
perl-Template--Plugin--GD--Graph--linespoints \
perl-Template--Plugin--GD--Graph--mixed \
perl-Template--Plugin--GD--Graph--pie \
perl-Template--Plugin--GD--Graph--pie3d \
perl-Template--Plugin--GD--Graph--points \
perl-Template--Plugin--GD--Image \
perl-Template--Plugin--GD--Polygon \
perl-Template--Plugin--GD--Text \
perl-Template--Plugin--GD--Text--Align \
perl-Template--Plugin--GD--Text--Wrap \
perl-Template-GD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-GD \
perl-Template"

inherit rpm
