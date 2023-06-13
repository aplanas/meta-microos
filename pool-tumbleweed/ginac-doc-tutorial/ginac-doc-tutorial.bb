SUMMARY = "The GiNaC tutorial in PDF format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides a tutorial file for GiNaC in PDF format."
LICENSE = "GPL-2.0-only"

PV = "1.8.5"

RPM_NAME = "ginac-doc-tutorial-1.8.5-2.3.noarch.rpm"
RPM_HASH = "db7e5009c6bdbff1e325b6a2e12e55367f6738defdfc7eeaca1dbd43a258b7ecf395e727c173ce62befb6dbf1d533799041df3185436777a40e9e16e701cf799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-tutorial"

RDEPENDS:${PN} += ""

inherit rpm
