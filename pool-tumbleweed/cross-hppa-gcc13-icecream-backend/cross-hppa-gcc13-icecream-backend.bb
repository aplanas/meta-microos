SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-hppa-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "29361dbbbff5299a8eb5a03840ca003040bfcfd5458fe3cbbd4e4fe325cc7c831241133dbe27d850244ad8a4f48c58c3ccbd475d0f2a17c590013031d5d48369"

RPROVIDES:${PN} += "cross-hppa-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
