SUMMARY = "Series of charting modules"
DESCRIPTION = "Chart helps you to create PNG and JPG images with visualizations of numeric \
data. This page gives you a summary how to use it. For a more thorough \
documentation and lots of example code please visit the Chart::Manual."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.403.9"

RPM_NAME = "perl-Chart-2.403.9-1.2.noarch.rpm"
RPM_HASH = "feea8146958141139a64674a388ff4094befd8add21fc162c01835a06c84dfbd1df161b2440246af0e352e6d432c072392da7dbe668bc59c8b623c4162c06d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Chart \
perl-Chart--Bars \
perl-Chart--Base \
perl-Chart--BrushStyles \
perl-Chart--Composite \
perl-Chart--Constants \
perl-Chart--Direction \
perl-Chart--ErrorBars \
perl-Chart--HorizontalBars \
perl-Chart--Lines \
perl-Chart--LinesPoints \
perl-Chart--Mountain \
perl-Chart--Pareto \
perl-Chart--Pie \
perl-Chart--Points \
perl-Chart--Property \
perl-Chart--Property--DataType--Color \
perl-Chart--Property--DataType--Font \
perl-Chart--Split \
perl-Chart--StackedBars"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Carp \
perl-GD \
perl-Graphics--Toolkit--Color"

inherit rpm
