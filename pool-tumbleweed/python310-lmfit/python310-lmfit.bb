SUMMARY = "Least-Squares Minimization with Bounds and Constraints"
DESCRIPTION = "A library for least-squares minimization and data fitting in \
Python.  Built on top of scipy.optimize, lmfit provides a Parameter object \
which can be set as fixed or free, can have upper and/or lower bounds, or \
can be written in terms of algebraic constraints of other Parameters.  The \
user writes a function to be minimized as a function of these Parameters, \
and the scipy.optimize methods are used to find the optimal values for the \
Parameters.  The Levenberg-Marquardt (leastsq) is the default minimization \
algorithm, and provides estimated standard errors and correlations between \
varied Parameters.  Other minimization methods, including Nelder-Mead's \
downhill simplex, Powell's method, BFGS, Sequential Least Squares, and \
others are also supported.  Bounds and constraints can be placed on \
Parameters for all of these methods. \
 \
In addition, methods for explicitly calculating confidence intervals are \
provided for exploring minmization problems where the approximation of \
estimating Parameter uncertainties from the covariance matrix is \
questionable."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "python310-lmfit-1.2.2-1.1.noarch.rpm"
RPM_HASH = "196da22900e7c02ca9095a82a9780fdc62e5cb06e71aaf0a65c14f2b63d5a715d54ffdd8fc1b68b99ac5134dc9f208b6b7cc8dce77c5e036c18e6c4db0b7a446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lmfit \
python310-lmfit \
python3dist-lmfit"

RDEPENDS:${PN} += "python-abi \
python310-asteval \
python310-numpy \
python310-scipy \
python310-uncertainties"

inherit rpm
