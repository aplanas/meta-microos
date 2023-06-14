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

RPM_NAME = "python310-lmfit-1.1.0-1.3.noarch.rpm"
RPM_HASH = "f88d313894665b2da6afc44a26e2e94cb8f110c615fe5e575b117e9c67d82601ffad596977b4b7e7273251f4fb670b03bef510b9b442ac4aa6ef1682062c6c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lmfit \
python3.10dist-lmfit \
python310-lmfit \
python3dist-lmfit"

RDEPENDS:${PN} += "python-abi \
python310-asteval \
python310-numpy \
python310-scipy \
python310-uncertainties"

inherit rpm
