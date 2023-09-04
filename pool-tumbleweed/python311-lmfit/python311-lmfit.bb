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

RPM_NAME = "python311-lmfit-1.2.2-1.1.noarch.rpm"
RPM_HASH = "691724c2da1a4da58216b63f7aac38cbf366ca5d7d5d0e4bbaf3668d62d5cdd1c992617dbd8ad8816688ee5fa16a6929cf88945c0e4674279f3f4f75c7493b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lmfit \
python3.11dist-lmfit \
python311-lmfit \
python3dist-lmfit"

RDEPENDS:${PN} += "python-abi \
python311-asteval \
python311-numpy \
python311-scipy \
python311-uncertainties"

inherit rpm
