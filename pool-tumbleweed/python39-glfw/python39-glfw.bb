SUMMARY = "A ctypes-based wrapper for GLFW3"
DESCRIPTION = "This module provides Python bindings for GLFW . It is a \
ctypes wrapper which keeps very close to the original GLFW API, \
except for: \
 \
-  function names use the pythonic ``words_with_underscores`` notation \
   instead of ``camelCase`` \
-  ``GLFW_`` and ``glfw`` prefixes have been removed, as their function \
   is replaced by the module namespace \
-  structs have been replaced with Python sequences \
-  functions like ``glfwGetMonitors`` return a list instead of a pointer \
   and an object count \
-  Gamma ramps use floats between 0.0 and 1.0 instead of unsigned shorts \
-  GLFW errors are reported as ``glfw.GLFWError`` exceptions if no error \
   callback is set (use ``glfw.ERROR_REPORTING=False`` to disable this)"
LICENSE = "MIT"

PV = "2.5.5"

RPM_NAME = "python39-glfw-2.5.5-1.4.noarch.rpm"
RPM_HASH = "31a544a239705243ac13dcb2b8b3e1517fd6020a539fdd5e66f327e1dcb0a7e7f172f6a81fc409974279707eb26145ca765a60457acdf3837f6b25418ebe832c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(glfw) \
python39-glfw \
python3dist(glfw)"

RDEPENDS:${PN} += "libglfw3 \
python(abi)"

inherit rpm
