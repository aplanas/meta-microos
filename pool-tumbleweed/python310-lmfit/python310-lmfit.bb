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

RPM_NAME = "python310-lmfit-1.1.0-1.5.noarch.rpm"
RPM_HASH = "a27b988e250b9e17ba19d52b67081e4a96327f41d686a991320ea5f7fe431599d3228a67e7749e62c67936ed1a91133ed621545a960f04f5d2fe5d921c644693"
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
