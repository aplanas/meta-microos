SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages. \
 \
The library covers the following areas: \
 \
Complex Numbers - Roots of Polynomials - Special Functions - \
Vectors and Matrices - Permutations - Sorting - BLAS Support - \
Linear Algebra - Eigensystems - Fast Fourier Transforms - Quadrature - \
Random Numbers - Quasi-Random Sequences - Random Distributions - \
Statistics - Histograms - N-Tuples - Monte Carlo Integration - \
Simulated Annealing - Differential Equations - Interpolation - \
Numerical Differentiation - Chebyshev Approximation - Series Acceleration - \
Discrete Hankel Transforms - Root-Finding - Minimization - \
Least-Squares Fitting - Physical Constants - IEEE Floating-Point"
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgsl27-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "fd7b2890fe75e853a03717962f9e9bb670d5a4dabdaa065e1a750acb6a46b75680eba0e93af18d7d2dab8ddc2aa79e51e0b533e0974f23b7b154487f93b551bf"

RPROVIDES:${PN} += "libgsl.so.27()(64bit) \
libgsl27 \
libgsl27(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
