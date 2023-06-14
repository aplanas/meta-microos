SUMMARY = "ScaLAPACK libraries compiled against openmpi2"
DESCRIPTION = "The ScaLAPACK (or Scalable LAPACK) library includes a subset \
of LAPACK routines redesigned for distributed memory MIMD \
parallel computers. It is currently written in a \
Single-Program-Multiple-Data style using explicit message \
passing for interprocessor communication. It assumes \
matrices are laid out in a two-dimensional block cyclic \
decomposition. \
 \
ScaLAPACK is designed for heterogeneous computing and is \
portable on any computer that supports MPI or PVM. \
 \
Like LAPACK, the ScaLAPACK routines are based on \
block-partitioned algorithms in order to minimize the frequency \
of data movement between different levels of the memory hierarchy. \
(For such machines, the memory hierarchy includes the off-processor \
memory of other processors, in addition to the hierarchy of registers, \
cache, and local memory on each processor.) The fundamental building \
blocks of the ScaLAPACK library are distributed memory versions (PBLAS) \
of the Level 1, 2 and 3 BLAS, and a set of Basic Linear Algebra \
Communication Subprograms (BLACS) for communication tasks that arise \
frequently in parallel linear algebra computations. In the ScaLAPACK \
routines, all interprocessor communication occurs within the PBLAS and the \
BLACS. One of the design goals of ScaLAPACK was to have the ScaLAPACK \
routines resemble their LAPACK equivalents as much as possible. \
 \
This package contains ScaLAPACK	libraries compiled with	openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi2-hpc-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "9fa0f786a4798688ae0afe0442a19739529d89c135577936e5cd639eed22a1c0bd25d251b32b2dbe61a8e7a5067c3c098db863db8fa014d1d3602035ee14b3c5"

RPROVIDES:${PN} += "libblacs2-2-1-0-gnu-openmpi2-hpc \
libscalapack2-2-1-0-gnu-openmpi2-hpc \
scalapack-2-1-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc \
libopenmpi2-gnu-hpc \
lua-lmod \
scalapack-2-1-0-gnu-openmpi2-hpc-module"

inherit rpm
