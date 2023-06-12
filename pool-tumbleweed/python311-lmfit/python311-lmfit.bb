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

PV = "1.1.0"

RPM_NAME = "python311-lmfit-1.1.0-1.3.noarch.rpm"
RPM_HASH = "314036870e48c21d3d29e534511077a77811c2d6c574771eb3521aedc74f1a8e781c385ddc25c3ae7232dcd3eeb42471ba13bae5b0ff38af5f35ed3d409caf4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lmfit) \
python311-lmfit \
python3dist(lmfit)"
RDEPENDS:${PN} += "python(abi) \
python311-asteval \
python311-numpy \
python311-scipy \
python311-uncertainties"

inherit rpm
