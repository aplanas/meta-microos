SUMMARY = "A memory-efficient packed representation for bit arrays in pure Python"
DESCRIPTION = "With regard to the basic purpose of the module, it defines \
the BitVector class as a memory-efficient packed \
representation for bit arrays. The class comes with a large \
number of methods for using the representation in diverse \
applications such as computer security, computer vision, \
etc."
LICENSE = "Python-2.0"

PV = "3.5.0"

RPM_NAME = "python310-BitVector-3.5.0-1.9.noarch.rpm"
RPM_HASH = "0d0d266c44382fb2cf3c65f169f62dab8dda69bbc408f243ae07c36886bc1910347adc5b2ccab0863d3f56b927031314c241dcf79a10dbef7b9a6f0456e065fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bitvector \
python310-BitVector \
python3dist-bitvector"

RDEPENDS:${PN} += "python-abi"

inherit rpm
