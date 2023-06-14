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

RPM_NAME = "libgsl_2_7_1-gnu-hpc-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "c4bf39d52516d37eb6755a1c88fd2eaefd0bd98fab5563361473101cca8990638315b4130f88a3c9bb87cd1b937fcecdda455bab5778a699e418517952afa638"

RPROVIDES:${PN} += "libgsl-2-7-1-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
gsl-2-7-1-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
lua-lmod"

inherit rpm
