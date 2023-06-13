SUMMARY = "Haskell yesod-static library development files"
DESCRIPTION = "This package provides the Haskell yesod-static library development files."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-devel-1.6.1.0-4.4.aarch64.rpm"
RPM_HASH = "5091ae4ccd92ad6fd198e2e54d283b4aa91b7d65374d826bcfed2e5f2ceed2a5463c7a3046b3066e84a2dd42527da1abee83748dd7858b67fa94901f734f8e6b"

RPROVIDES:${PN} += "ghc-devel(yesod-static-1.6.1.0-DEqPHy4hggrCzWSPgCKUoY) \
ghc-yesod-static-devel \
ghc-yesod-static-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-devel(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(containers-0.6.7) \
ghc-devel(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) \
ghc-devel(cryptonite-conduit-0.2.2-Ic5yZAN3MwnLmQgFse4azZ) \
ghc-devel(css-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(hjsmin-0.2.1-G11T0ofJtyz5gQQf6GRgL1) \
ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-devel(mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm) \
ghc-devel(process-1.6.16.0) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-devel(wai-app-static-3.1.7.4-9UpsDZD9lQf3J0Cj3szLw2) \
ghc-devel(yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG) \
ghc-yesod-static"

inherit rpm
