SUMMARY = "HPC Development Packages"
DESCRIPTION = "This package provides all the relevant packages for developing HPC applications. \
It depends on the pattern 'HPC Modularized Libraries'. In addition it includes the GNU compilers and the relevant management packages."
LICENSE = "MIT"

PV = "20190218"

RPM_NAME = "patterns-hpc-development_node-20190218-7.1.aarch64.rpm"
RPM_HASH = "3b90ac5442c67873a82d9035aca71aded072d3b4137bbd4177e3b7dc64f33d5d960e3e7a4e608555c86e9ec62f2fdb039db8b5aab6b27b184668833ff3c67543"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-hpc-development-node"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
iputils \
lua-lmod \
mpich-gnu-hpc-devel \
mpich-ofi-gnu-hpc-devel \
mvapich2-gnu-hpc-devel \
pattern-"

inherit rpm
