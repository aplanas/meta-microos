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

PV = "3.0800"

RPM_NAME = "perl-Statistics-Descriptive-3.0800-1.13.noarch.rpm"
RPM_HASH = "265f09376f6d548af450492ad3229515007bd1f23cb64a3eb6d5ea5584636a2fc79933c9dc843778eca35fc477b7e0756ec9c632adcc44533090682d8d9d5ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Statistics--Descriptive \
perl-Statistics--Descriptive--Full \
perl-Statistics--Descriptive--Smoother \
perl-Statistics--Descriptive--Smoother--Exponential \
perl-Statistics--Descriptive--Smoother--Weightedexponential \
perl-Statistics--Descriptive--Sparse \
perl-Statistics-Descriptive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--MoreUtils \
perl-parent"

inherit rpm
