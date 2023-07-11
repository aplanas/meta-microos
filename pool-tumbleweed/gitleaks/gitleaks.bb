SUMMARY = "Protect and discover secrets using Gitleaks"
DESCRIPTION = "Gitleaks is a SAST tool for detecting and preventing hardcoded secrets like passwords, api keys, and tokens in git repos. Gitleaks is an easy-to-use, all-in-one solution for detecting secrets, past or present, in your code."
LICENSE = "MIT"

PV = "8.16.0"

RPM_NAME = "gitleaks-8.16.0-1.5.aarch64.rpm"
RPM_HASH = "5800650fd78dd0302d909efc0b9db8e88b2e640d8b204617d80f965a304605dd6dde7aa26177c4a068e10964a71705c92db959f5ce3526418ede4e024d2408d0"

RPROVIDES:${PN} += "gitleaks"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
