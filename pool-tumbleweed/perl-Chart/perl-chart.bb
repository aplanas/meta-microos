SUMMARY = "Series of charting modules"
DESCRIPTION = "Chart helps you to create PNG and JPG images with visualizations of numeric \
data. This page gives you a summary how to use it. For a more thorough \
documentation and lots of example code please visit the Chart::Manual."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.403.9"

RPM_NAME = "perl-Chart-2.403.9-1.3.noarch.rpm"
RPM_HASH = "dc5843b3f129afaf9e4a57a694585c0c920219f0ff0654e0535daff50bfef9baf345474dca274144ccc8fb8e9636f252ada032b63939aaffdf37c599d57b026f"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Carp \
perl-GD \
perl-Graphics--Toolkit--Color"

inherit rpm
