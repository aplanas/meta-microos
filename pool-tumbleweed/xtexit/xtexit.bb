SUMMARY = "Prompt on exiting X"
DESCRIPTION = "`xtexit` sends an request to all clients to shut down. If the \
application still needs an user interaction (e.g., if a file should be \
saved) this is possible. \
 \
If you answer by the affirmative, all applications will be closed. This \
method is not fully waterproof, but better than killing each and every \
client without being able to interfere. \
 \
xterm applications anyway are killed immediately! \
 \
If this package is installed, it will be automatically integrated into \
the sample user fvwm menu."
LICENSE = "MIT"

PV = "0.42"

RPM_NAME = "xtexit-0.42-1250.20.aarch64.rpm"
RPM_HASH = "0bf635d3b80f8095477496e872471c0865a8dcb1cbb8d4720ac527b0a79c1a6c072e88db107360843b946337fabadeca611a8175a3346e429b89afe4080db616"

RPROVIDES:${PN} += "config(xtexit) \
xtexit \
xtexit(aarch-64)"

RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
xaw3d"

inherit rpm
