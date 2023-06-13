SUMMARY = "CLI tool for interacting with remote images and registries"
DESCRIPTION = "Useful tips and things you can do with crane and other standard tools. \
 \
List files in an image \
crane export registry.opensuse.org/opensuse/tumbleweed - | tar -tvf - | less \
 \
Export a file from an image \
crane export registry.opensuse.org/opensuse/tumbleweed -  | tar -0xf - etc/passwd \
 \
Diff two configs \
diff -u <(crane config busybox:1.32 | jq) <(crane config busybox:1.33 | jq) \
 \
Diff two manifests \
diff -u <(crane manifest busybox:1.32 | jq) <(crane manifest busybox:1.33 | jq) \
 \
Diff filesystem contents \
diff -u \\ \
   <(crane export gcr.io/kaniko-project/executor:v1.6.0-debug - | tar -tvf - | sort) \\ \
   <(crane export gcr.io/kaniko-project/executor:v1.7.0-debug - | tar -tvf - | sort)"
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "crane-0.12.1-1.3.aarch64.rpm"
RPM_HASH = "f0e389e4ad05424e2782d66c08aabf5eb6f82f2165f8921e29bdd3cb4267e0b0b67a4be0fca346f29b6f7a925ab541dd506dd913f7e2cb9edf2f500f6abf0b12"

RPROVIDES:${PN} += "crane \
crane(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
