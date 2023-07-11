SUMMARY = "A pure python implementation of a sliding window memory map manager"
DESCRIPTION = "When reading from many possibly large files in a fashion similar to random \
access, it is usually the fastest and most efficient to use memory maps. \
Although memory maps have many advantages, they represent a very limited \
system resource as every map uses one file descriptor, whose amount is \
limited per process. On 32 bit systems, the amount of memory you can have \
mapped at a time is naturally limited to theoretical 4GB of memory, which \
may not be enough for some applications. \
 \
The documentation can be found here: http://packages.python.org/smmap"
LICENSE = "BSD-2-Clause"

PV = "5.0.0"

RPM_NAME = "python311-smmap-5.0.0-2.3.noarch.rpm"
RPM_HASH = "f81480a8d8d841f46505f5142fa6367f89d556c1a4ec5c26240c76dd1fac873e7e7360df5163d5417bfcb4785c2c1750c86d6e0bd1d6d0e49372ef2e66663209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smmap \
python3.11dist-smmap \
python311-smmap \
python3dist-smmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
