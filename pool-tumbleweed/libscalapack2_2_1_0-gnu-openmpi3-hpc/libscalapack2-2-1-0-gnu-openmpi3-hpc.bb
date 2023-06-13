SUMMARY = "ScaLAPACK libraries compiled against openmpi3"
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
This package contains ScaLAPACK	libraries compiled with	openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi3-hpc-2.1.0-9.18.aarch64.rpm"
RPM_HASH = "fb764411d77c6c2ea54489f3ecbad50c3bf3572c69f77253f6bde3b001efc615883e581779742c5be6198c6dbe95e3bad6be07484156ac403ae9d3b7d00e4503"

RPROVIDES:${PN} += "libblacs2_2_1_0-gnu-openmpi3-hpc \
libscalapack2_2_1_0-gnu-openmpi3-hpc \
libscalapack2_2_1_0-gnu-openmpi3-hpc(aarch-64) \
scalapack_2_1_0-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libopenblas-gnu-hpc \
libopenmpi3-gnu-hpc \
lua-lmod \
scalapack_2_1_0-gnu-openmpi3-hpc-module"

inherit rpm
