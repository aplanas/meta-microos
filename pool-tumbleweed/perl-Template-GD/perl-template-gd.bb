SUMMARY = "Template::GD Perl module"
DESCRIPTION = "Template::GD Perl module"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.66"

RPM_NAME = "perl-Template-GD-2.66-1.22.noarch.rpm"
RPM_HASH = "207fe70346ca2a35b09c1ce4fb96026c89292c486c8cfe1940a22487ad8d07967c36dd4f7f0ee2b5a72db298f544a6ab9433d9dfdf5dd47bf540f6acecbb7a1c"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-GD \
perl-Template"

inherit rpm
