SUMMARY = "Haskell warp library development files"
DESCRIPTION = "This package provides the Haskell warp library development files."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-devel-3.3.25-1.13.aarch64.rpm"
RPM_HASH = "8377701eddd21e863d072a2dae239851098f4594c4162f0755fcf45857213a3c5052074417a29e7e7c7d183b82786f2fde083dd5a2c390cffbe103a1e0091fc5"

RPROVIDES:${PN} += "ghc-devel-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-warp-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bsb-http-chunked-0.0.0.4-6Uz6ZfX3tBC2nOluTU0Lnf \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-http-date-0.0.11-HoNgmNPQQe1ErFjujEoPyv \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-http2-3.0.3-41eYSHbDrcoAjUXjlws3pm \
ghc-devel-iproute-1.7.12-A34D1N9dJmL5ps3agDCHa7 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-recv-0.1.0-E4Of8dJv2WfHRGIVsQUgMj \
ghc-devel-simple-sendfile-0.2.32-Jkz6BAomm8GAcovJHWebTs \
ghc-devel-stm-2.5.1.0 \
ghc-devel-streaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z \
ghc-devel-text-2.0.2 \
ghc-devel-time-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS \
ghc-devel-unix-2.7.3 \
ghc-devel-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-devel-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-devel-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-devel-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-warp"

inherit rpm
