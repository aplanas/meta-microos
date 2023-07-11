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

RPM_NAME = "python311-glfw-2.5.5-1.5.noarch.rpm"
RPM_HASH = "319b44ba0f390a4e13c0235920d949bac793f8025c84cd4f2214ccb688291efa104328bf2f6472842c846ba10c86ba74dfb2304167854ead2cee0dd2843914a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glfw \
python3.11dist-glfw \
python311-glfw \
python3dist-glfw"

RDEPENDS:${PN} += "libglfw3 \
python-abi"

inherit rpm
