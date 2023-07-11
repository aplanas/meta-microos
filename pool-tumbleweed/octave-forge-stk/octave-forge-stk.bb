SUMMARY = "Small Octave Toolbox for Kriging"
DESCRIPTION = "The STK is a (not so) Small Toolbox for Kriging. Its primary focus \
in on the interpolation/regression technique known as kriging, which \
is very closely related to Splines and Radial Basis Functions, and can be \
interpreted as a non-parametric Bayesian method using a Gaussian Process \
(GP) prior. The STK also provides tools for the sequential and \
non-sequential design of experiments. Even though it is, currently, mostly \
geared towards the Design and Analysis of Computer Experiments (DACE), the \
STK can be useful for other applications areas (such as Geostatistics, \
Machine Learning, Non-parametric Regression, etc.). \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "octave-forge-stk-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "acfcc428cd8e5d1d8f52dc56b8753d29dd1c6f157579b7f320650bf99657418a2db3e3d868bd159346788a68d8408bf2ac5e1bf10a3794d64f3fffdf2ad470f2"

RPROVIDES:${PN} += "octave-forge-stk"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
octave-cli"

inherit rpm
