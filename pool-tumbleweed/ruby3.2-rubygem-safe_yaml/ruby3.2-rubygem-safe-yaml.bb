SUMMARY = "SameYAML provides an alternative implementation of YAML.load"
DESCRIPTION = "Parse YAML safely."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "ruby3.2-rubygem-safe_yaml-1.0.5-1.19.aarch64.rpm"
RPM_HASH = "a22dfe393e90855cd6f17e41bc1fbadf7504af4d9507a10b435d1fcdf7bef164d6ccf677a9cad2f9a1191d82dda3ade3f422b508fc1d90021e9bbf76ad267ba1"

RPROVIDES:${PN} += "ruby3.2-rubygem-safe_yaml \
ruby3.2-rubygem-safe_yaml(aarch-64) \
rubygem(ruby:3.2.0:safe_yaml) \
rubygem(ruby:3.2.0:safe_yaml:1) \
rubygem(ruby:3.2.0:safe_yaml:1.0) \
rubygem(ruby:3.2.0:safe_yaml:1.0.5) \
rubygem(safe_yaml)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
update-alternatives"

inherit rpm
