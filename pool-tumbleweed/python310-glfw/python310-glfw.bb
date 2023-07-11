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

RPM_NAME = "python310-glfw-2.5.5-1.5.noarch.rpm"
RPM_HASH = "78cbb3677f48e5829f052daab4585b07ef218be50a5d9454478480aaf90309c240b5bd578a3ac0999bfecfb3c3539c05185e06d200dcf70017b248396a6630f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-glfw \
python310-glfw \
python3dist-glfw"

RDEPENDS:${PN} += "libglfw3 \
python-abi"

inherit rpm
