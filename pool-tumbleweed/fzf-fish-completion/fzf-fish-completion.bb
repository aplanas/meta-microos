SUMMARY = "Fish completion for fzf"
DESCRIPTION = "fish shell completions for fzf \
 \
To enable it, ensure you have a file ~/.config/fish/functions/fish_user_key_bindings.fish \
which contains: \
function fish_user_key_bindings \
	fzf_key_bindings \
end \
 \
(or append fzf_key_bindings to the fish_user_key_bindings function if the file already exists)"
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-fish-completion-0.42.0-1.2.noarch.rpm"
RPM_HASH = "cfc9f09936e5a46564ae3cdbe5ff275244eab7cb3fa591bd739699fe8a95efa24c83c2fd360f92426c70d82c8b2d6f04645d919f4232d2a56c59efe3a38a3efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-fish-completion"

RDEPENDS:${PN} += "fish \
fzf"

inherit rpm
