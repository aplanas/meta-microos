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

RPM_NAME = "python310-glfw-2.5.5-1.4.noarch.rpm"
RPM_HASH = "2b32f71c17b3eab6c53fde37cf4467cd025fd779a0b3c53bf57e5ef9456fcd6f58aa9c0f2a5a75de75b686cb5ecf84403ae41c4d696d8b81333568bcdc63b052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glfw \
python3.10dist-glfw \
python310-glfw \
python3dist-glfw"

RDEPENDS:${PN} += "libglfw3 \
python-abi"

inherit rpm
