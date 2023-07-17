SUMMARY = "Haskell wai-extra profiling library"
DESCRIPTION = "This package provides the Haskell wai-extra profiling library."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-prof-3.1.13.0-2.9.aarch64.rpm"
RPM_HASH = "84310a0d5e4d3f646e35e02971a6d78684af32be3c360ae05320eb24a15255b620c3658054d61f2c152dac6a4457b5e323550a15a3d8ae4e41a9ce2f5e3cb15a"

RPROVIDES:${PN} += "ghc-prof-wai-extra-3.1.13.0-LFtqIngDY3AAQ1a5w3zKO8 \
ghc-wai-extra-prof"

RDEPENDS:${PN} += "ghc-prof-HUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-directory-1.3.7.1 \
ghc-prof-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-iproute-1.7.12-IhoklPQYItb8qGu1G3vmcD \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-wai-logger-2.4.0-JuVFE6hpBhqDKHgP60Zmqn \
ghc-prof-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-prof-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-wai-extra-devel"

inherit rpm
