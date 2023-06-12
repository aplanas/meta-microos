SUMMARY = "Haskell connection profiling library"
DESCRIPTION = "This package provides the Haskell connection profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-prof-0.3.1-7.2.aarch64.rpm"
RPM_HASH = "4fe3706d60249eb9ba43a70123062a868ba3e91a9d14af6655b396985a5d4885b7621e6ab0ff4381bd4a3e675fc9ca7faf78166220b17ca7903134889fc3d3e2"

RPROVIDES:${PN} += "ghc-connection-prof \
ghc-connection-prof(aarch-64) \
ghc-prof(connection-0.3.1-IDyFh0K8hgZvp3uiDVm7m)"
RDEPENDS:${PN} += "ghc-connection-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(socks-0.6.1-CAd82jbrmKj2bUx8fkWhGg) \
ghc-prof(tls-1.6.0-48osxqPawrs8SblkErmTaM) \
ghc-prof(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) \
ghc-prof(x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt) \
ghc-prof(x509-system-1.6.7-BOgSBhUS7jg4riLu2Dt4H7) \
ghc-prof(x509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO)"

inherit rpm
