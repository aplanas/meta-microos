SUMMARY = "Haskell wai-extra library development files"
DESCRIPTION = "This package provides the Haskell wai-extra library development files."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-devel-3.1.13.0-2.7.aarch64.rpm"
RPM_HASH = "759e69297d752a2c7fd7d48304c89db93aba2b6ddec9180689dfd75d123dd044701cc8dbc7eda41f31ac5d78571d760939eec6d30ead35e0c7b04e5619f15c6e"

RPROVIDES:${PN} += "ghc-devel-wai-extra-3.1.13.0-3pmfL93b8iXAmoBQvHdwGU \
ghc-wai-extra-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-HUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-directory-1.3.7.1 \
ghc-devel-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-iproute-1.7.12-IhoklPQYItb8qGu1G3vmcD \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-logger-2.4.0-HFZNBDhfTBI6FWxvAW2OQE \
ghc-devel-warp-3.3.25-7qOcByHeVpuMAFF4vrupa \
ghc-devel-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-wai-extra"

inherit rpm
