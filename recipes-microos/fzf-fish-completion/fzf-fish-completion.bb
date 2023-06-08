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

PV = "0.40.0"

RPM_NAME = "fzf-fish-completion-0.40.0-1.1.noarch.rpm"
RPM_HASH = "a9ace811b9146d5cb5a39d8863e9a90b783b20c0c9fa922fed77f3a28e573c9e317da95bda900adbb5f0b2a02e7e5bbedf9c6b3d70e59d23a02e6bd0879881b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-fish-completion"
RDEPENDS:${PN} += "fish fzf"

inherit rpm
