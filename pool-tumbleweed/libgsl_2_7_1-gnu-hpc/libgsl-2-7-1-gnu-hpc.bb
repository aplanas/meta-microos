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

RPM_NAME = "libgsl_2_7_1-gnu-hpc-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "2b93fb49e356748030504057f9311391e801c517ca6481346e00cecb111f870bad21961b290f6c2560bc42a98fd780fcb3983bdff8b1f171cda89daa4ab74881"

RPROVIDES:${PN} += "libgsl-2-7-1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
gsl-2-7-1-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
lua-lmod"

inherit rpm
