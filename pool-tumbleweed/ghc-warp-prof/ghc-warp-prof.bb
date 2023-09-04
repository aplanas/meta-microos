SUMMARY = "Haskell warp profiling library"
DESCRIPTION = "This package provides the Haskell warp profiling library."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-prof-3.3.25-1.13.aarch64.rpm"
RPM_HASH = "2bb6a6ab2dffe90661d2c5349d7d9b8d6393527e8ea862647c45a2a6159da4b55c535ddc9c9da0ebacfb222257a75987139121ed743a6f9074f242c68fa54061"

RPROVIDES:${PN} += "ghc-prof-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-warp-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bsb-http-chunked-0.0.0.4-6Uz6ZfX3tBC2nOluTU0Lnf \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-http-date-0.0.11-HoNgmNPQQe1ErFjujEoPyv \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-http2-3.0.3-41eYSHbDrcoAjUXjlws3pm \
ghc-prof-iproute-1.7.12-A34D1N9dJmL5ps3agDCHa7 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-recv-0.1.0-E4Of8dJv2WfHRGIVsQUgMj \
ghc-prof-simple-sendfile-0.2.32-Jkz6BAomm8GAcovJHWebTs \
ghc-prof-stm-2.5.1.0 \
ghc-prof-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-prof-text-2.0.2 \
ghc-prof-time-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS \
ghc-prof-unix-2.7.3 \
ghc-prof-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-prof-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-prof-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-prof-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-warp-devel"

inherit rpm
