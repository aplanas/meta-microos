SUMMARY = "Module of basic descriptive statistical functions"
DESCRIPTION = "This module provides basic functions used in descriptive statistics. It has \
an object oriented design and supports two different types of data storage \
and calculation objects: sparse and full. With the sparse method, none of \
the data is stored and only a few statistical measures are available. Using \
the full method, the entire data set is retained and additional functions \
are available. \
 \
Whenever a division by zero may occur, the denominator is checked to be \
greater than the value '$Statistics::Descriptive::Tolerance', which \
defaults to 0.0. You may want to change this value to some small positive \
value such as 1e-24 in order to obtain error messages in case of very small \
denominators. \
 \
Many of the methods (both Sparse and Full) cache values so that subsequent \
calls with the same arguments are faster."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.0801"

RPM_NAME = "perl-Statistics-Descriptive-3.0801-1.2.noarch.rpm"
RPM_HASH = "77bb03dfb31693f65e3c17f88f7b42313776e4dcc3e7d417bdde22d80bfe128e62f49d51f24fae338782e28c7a43f33d20c558b8f3c87daa90f8093a8ee7cc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Statistics--Descriptive \
perl-Statistics--Descriptive--Full \
perl-Statistics--Descriptive--Smoother \
perl-Statistics--Descriptive--Smoother--Exponential \
perl-Statistics--Descriptive--Smoother--Weightedexponential \
perl-Statistics--Descriptive--Sparse \
perl-Statistics-Descriptive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-List--MoreUtils \
perl-parent"

inherit rpm
