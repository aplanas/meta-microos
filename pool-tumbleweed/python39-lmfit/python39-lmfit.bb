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

RPM_NAME = "python39-lmfit-1.1.0-1.5.noarch.rpm"
RPM_HASH = "f4758de7817db7d5a971908dbdab9bcf4bcf1b60cb8eda45d0611cddb60e4a98acae645d135c9068c1440a4a7d29727d7ea783c79fc16cd1df033498f7a6bbc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lmfit \
python39-lmfit \
python3dist-lmfit"

RDEPENDS:${PN} += "python-abi \
python39-asteval \
python39-numpy \
python39-scipy \
python39-uncertainties"

inherit rpm
