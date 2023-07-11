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

RPM_NAME = "python310-smmap-5.0.0-2.3.noarch.rpm"
RPM_HASH = "479ab877c8c2800de219a5cfff33a0e8084946e3dcde427980cb36feaf7a5391f25c86d68ef55da6f5300b1222affb915f4e765e76049fe2249233ac8fb54ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-smmap \
python310-smmap \
python3dist-smmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
