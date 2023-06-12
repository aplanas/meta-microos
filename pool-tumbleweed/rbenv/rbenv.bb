SUMMARY = "Simple Ruby version Management"
DESCRIPTION = "rbenv does… \
 \
- Let you change the global Ruby version on a per-user basis. \
- Provide support for per-project Ruby versions. \
- Allow you to override the Ruby version with an environment variable. \
 \
In contrast with rvm, rbenv does not… \
 \
- Need to be loaded into your shell. Instead, rbenv's shim approach works by adding a directory to your $PATH. \
- Override shell commands like cd. That's dangerous and error-prone. \
- Have a configuration file. There's nothing to configure except which version of Ruby you want to use. \
- Install Ruby. You can build and install Ruby yourself, or use ruby-build to automate the process. \
- Manage gemsets. Bundler is a better way to manage application dependencies. If you have projects that are not yet using Bundler you can install the rbenv-gemset plugin. \
- Require changes to Ruby libraries for compatibility. The simplicity of rbenv means as long as it's in your $PATH, nothing else needs to know about it. \
- Prompt you with warnings when you switch to a project. Instead of executing arbitrary code, rbenv reads just the version name from each project. There's nothing to 'trust.'"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "rbenv-1.2.0-1.4.noarch.rpm"
RPM_HASH = "93f53f7d728caba1a7b2f721b79bdfac0b322f7bf295692f9291a82e8dd8594ba710d1126ea675690bcb62cc03e3e021445f39aa6621ae65388a1655f9735514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbenv"
RDEPENDS:${PN} += "/bin/bash \
procps"

inherit rpm
